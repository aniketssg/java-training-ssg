/**
 * Author - Aniket
 */
package com.CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Demo {
	
	//query for insertion
	private static final String Insertquery = "Insert into employee" +
			" (emp_id,emp_name,emp_address,emp_mob,emp_email,dept_id,emp_doj,proj_id)Values"+
						"(?,?,?,?,?,?,?,?);";
	
	//query for delete
	private static final String DeleteQuery = "delete from employee where emp_id = ?";
	
	//query for select
	private static final String Selectquery = "Select * from employee where emp_id = ?";
	
	//query for updation
	private static final String UpdateQuery = "update employee set emp_name = ? where emp_id = ? ";
	
	//driver function
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Demo crt = new Demo(); //creating an object of the demo class
		
		//crt.insertRecords();//calling the insert record method
		
		//crt.deleteRecords(); //calling the delete record method
		
		//crt.updateRecords(); //calling for the updation of the records
		
		crt.selectRecords(); //calling for the selection of the records
	}
	//inserting a record in the table
	public void insertRecords() throws Exception{
		
		//connection establishment 
		
		try (Connection con = DriverManager
	            .getConnection("jdbc:mysql://localhost:3306/sopra_aniket", "root", "Aniket@4950");
				
				//inserting the values in the table 
	            PreparedStatement ptsm = con.prepareStatement(Insertquery)) {
	            ptsm.setInt(1, 12);
	            ptsm.setString(2, "Ajay");
	            ptsm.setString(3, "GZB");
	            ptsm.setInt(4, 303);
	            ptsm.setString(5, "ajay@gmail.com");
	            ptsm.setString(6, "303");
	            ptsm.setDate(7, java.sql.Date.valueOf("2013-09-04"));
	            ptsm.setInt(8, 11);
	            int r=ptsm.executeUpdate();
	            if (r>0)
	            	System.out.println("updated");

	        } catch (Exception e) {

	            
	            System.out.println(e);
	        }
		}
	
	//Deleting a record from the table 
	public void deleteRecords() throws Exception{
		//connection establishment
		try (Connection con = DriverManager
	            .getConnection("jdbc:mysql://localhost:3306/sopra_aniket", "root", "Aniket@4950");
				
				//calling and running the delete query for the defined id 
				PreparedStatement del = con.prepareStatement(DeleteQuery)){
				del.setInt(1, 12);
			
				int rowsDeleted = del.executeUpdate();
				if (rowsDeleted > 0) {
					System.out.println("A user was deleted successfully!");
			}
		}
		catch (Exception e) {  
            System.out.println(e);
		}
				
	}
	
	//query for updating a record
	public void updateRecords() throws Exception{
		//connection establishment
		try (Connection con = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/sopra_aniket", "root", "Aniket@4950");
				
				//calling and running the update query
				PreparedStatement upd = con.prepareStatement(UpdateQuery)){
					upd.setString(1, "KD Singh");
					upd.setInt(2, 5);
					int updRows = upd.executeUpdate();
					if(updRows > 0) {
						System.out.println("Record Updated");
					}
			
		}
		catch (Exception e) {
            System.out.println(e);
		}
				
						
	}
	
	//query for selecting a record
	public void selectRecords() throws Exception{
		//connection establishment
		try (Connection con = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/sopra_aniket", "root", "Aniket@4950");
				
				//calling and running the select query
				PreparedStatement sel = con.prepareStatement(Selectquery)){
			sel.setInt(1, 3);
			
            ResultSet rs = sel.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int id = rs.getInt("emp_id");
                String name = rs.getString("emp_name");
                String address = rs.getString("emp_address");
                int mob = rs.getInt("emp_mob");
                String email = rs.getString("emp_email");
                
                System.out.println(id + "," + name + "," + address + "," + mob + "," + email);
            }
			
		}
		catch (Exception e) {
            System.out.println(e);
		}
						
	}
	}
