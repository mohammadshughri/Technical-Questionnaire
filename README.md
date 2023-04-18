# User Management Screen
## Requirements
The User Management is a web-based application that allows administrators to manage users in the system. 

The application should have the following features:

- Add new users to the system
- View a list of all users in the system
- Use various filters to sort the users

## UI Components
The User Management should include the following UI components:

- User List: A table that displays a list of all users in the system. Each row in the table should include the ID, user's name, email address, status (Enabled/Disabled), and to filter the users based on one of the previous attributes.
- Add User Form: A form that allows the administrator to add a new user to the system. The form should include fields for the username, display name, phone number, email address, user role, and the status of the user.

| ID  | UserName   | Email Address          | Current Status|
|-----|----------- |-----------------------|---------------|
| 1   | Admin      | Adminuser@piworks.net | True          |
| 2   | testUser1  |  testuser@piworks.net | True          |
| 3   | testUser2  |  testuser@piworks.net | Disabled      |
| 4   | testUser3  |  testuser@piworks.net | Disabled      |

## UI Behavior

### User List
When the User Management Screen is loaded, the User List should be displayed with a table that shows all users in the system.
Each row in the table should include the user's name, email address, and status. There will also be a button to hide the users that have the disabled status with a checkmark ✅ .

### Add User Form
When the Add User button is clicked, the Add User Form should be displayed.
The Add User Form should include fields for the user's name, email address, password, and role.
When the Save User button is clicked, the user's information should be validated, and if valid, the new user should be added to the system.
If the user is added successfully, the User List should be updated to include the new user.


## Initial Display
When the User Management Screen is loaded, the User List should be displayed with a table that shows all users in the system.

## Preview
![](preview.png)

## Conclusion
The User Management Screen is an essential tool for administrators to manage users in the system. The screen should be designed to be user-friendly, with clear instructions and feedback messages for users. With proper implementation of the UI components and behaviors described in this document, administrators will be able to manage users in the system efficiently.