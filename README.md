#  eCommerce Product-Management-Utility-Web-App-Advance-Java-

This utility is a web-based eCommerce product management tool designed for administrators. It allows admin users to log in, view a list of products, edit product attributes (such as title, quantity, size, and image), delete products, and see the total size of uploaded product images.

## Features

- User authentication through username and password.
- View a list of products with details.
- Edit product attributes (title, quantity, size, image).
- Delete products.
- Display the total size of uploaded product images.
- Proper validation and error messages.
- Exception handling for robustness.
- Uses Hibernate for database connectivity.
- No SQL scripts; uses Hibernate POJOs and HQL (Hibernate Query Language).
- Designed for Tomcat version 8 or above and Hibernate 

## Getting Started

To get started with the eCommerce Product Management Utility, follow these steps:

1. Clone the repository or download the source code.

2. Set up your database:
   - Configure your database connection details in the Hibernate configuration file (`hibernate.cfg.xml`).
   - Create the necessary database tables using Hibernate's automatic schema generation or SQL scripts if preferred.

3. Build and deploy the web application to your Tomcat server.

4. Access the application in your web browser.

## Usage

1. **Login**: Enter your username and password to log in as an administrator.

2. **Product Management Dashboard**: After successful login, you will be presented with a dashboard showing a list of products. Here you can:
   - Edit product attributes by clicking the "Edit" button.
   - Delete products by clicking the "Delete" button.
   - View the total size of uploaded product images at the bottom of the listing.

3. **Edit Product**: When you click the "Edit" button for a product, you can modify its attributes such as title, quantity, size, and image. Be mindful of the image size constraint (max 1 MB per image and max 10 MB for all images combined).

4. **Logout**: To logout, simply click the "Logout" button.

## Database Integration

The utility uses Hibernate to connect to the database. Ensure that you have correctly configured the database connection in the `hibernate.cfg.xml` file.


## Technologies Used

- Java
- Hibernate
- Tomcat
- HTML/CSS
- JavaScript

---
