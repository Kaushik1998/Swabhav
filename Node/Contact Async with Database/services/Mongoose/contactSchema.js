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
      },
      state: {
        type: String,
      },
      building: String,
      street: String,
      roomNo: String,
    },
  ],
  profilePicture: {
    data: String,
    contentType: String,
  },
  contact: {
    type: Number,
    required: true,
  },
});

module.exports = mongoose.model("Contact", contactSchema);
