const mongoose = require("mongoose");

const contactSchema = mongoose.Schema({
  name: {
    firstName: {
      type: String,
      required: true,
    },
    lastName: String,
  },
  address: [
    {
      city: {
        type: String,
        required: true,
      },
      state: {
        type: String,
        required: true,
      },
      building: String,
      street: String,
    },
  ],
  profilePicture: Buffer,
  contact: Number,
});

module.exports = mongoose.model("Contact", contactSchema);
