const url = `mongodb+srv://root:root@cluster0.iyeol.mongodb.net/<dbname>?retryWrites=true&w=majority`;
const { MongoClient, ObjectID } = require("mongodb");

module.exports = class MongoDBService {
  url = `mongodb+srv://root:root@cluster0.iyeol.mongodb.net/<dbname>?retryWrites=true&w=majority`;
  mongoDb = null;
  myDatabase = null;
  myCollection = null;
  constructor() {}

  startConnection = async () => {
    let mongoDb = null;
    await MongoClient.connect(url, {
      useUnifiedTopology: true,
    }).then((client) => {
      // this.database = client.db("Swabhav");
      // collection = this.database.collection("Student");
      mongoDb = client;
    });
    return mongoDb;
  };

  initializeDatabaseVariables = async () => {
    try {
      this.mongoDb = this.mongoDb || (await this.startConnection());
      this.myDatabase = this.myDatabase || this.mongoDb.db("Swabhav");
      this.myCollection =
        this.myCollection || this.myDatabase.collection("Student");
    } catch (error) {
      console.log(error);
    }
  };

  getContacts = async () => {
    await this.initializeDatabaseVariables();
    let contacts = null;
    await this.myCollection
      .find()
      .toArray()
      .then((results) => {
        contacts = results;
      });
    return contacts;
  };

  addContact = async (newContact) => {
    await this.initializeDatabaseVariables();
    let insertId = null;
    this.myCollection.insertOne(newContact).then((result) => {
      insertId = result;
    });
    return insertId;
  };

  getContactById = async (id) => {
    await this.initializeDatabaseVariables();
    let desiredContact = null;
    await this.myCollection
      .find({ _id: new ObjectID(id) })
      .toArray()
      .then((results) => {
        desiredContact = results;
      });
    return desiredContact;
  };

  clearTable = async () => {
    await this.initializeDatabaseVariables();
    return await this.myCollection.remove().then((result) => {
      return result;
    });
  };

  endConnection = async () => {
    await this.initializeDatabaseVariables();
    await this.mongoDb.close().then((r) => {
      console.log("Ending");
    });
  };
};
