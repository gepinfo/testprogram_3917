
import * as mongoose from 'mongoose';


const Schema = mongoose.Schema;

export const employeeSchema = new Schema({
   created_date: { type: Date, default: Date.now },
   created_by: { type: String },
   last_modified_by: { type: String },
   last_modified_date: { type: Date, default: Date.now },
   Name: { type: String },
   Age: { type: Number }
})

const employeeModel = mongoose.model('employee', employeeSchema, 'employee');
export default employeeModel;
