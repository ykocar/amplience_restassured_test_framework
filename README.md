**Amplience Restassured Test Project**

This project contains a test automation framework.

I have created project by using Maven as a build management tool.

I have written my test cases by using Java as a programming language and Junit5 as a testing tool.

I also use REST Assured library to test RESTful APIs.

I have added client credentials (client_id and client_secret) in the .env file. Those credentials are not committed but taken from (.env file) at run time. I added this (.env file) into (.gitignore file). So, please create your own env file with those Credentials:

- GRANT_TYPE=<YOUR_GRANT_TYPE>
- CLIENT_ID=<YOUR_CLIENT_ID>
- CLIENT_SECRET=<YOUR_CLIENT_SECRET>

I got access_token in oauth2 client by using Client Credentials grant type.

I have made a set of assertions under each test to run against that endpoint.

I also have created a jsonSchema under Test folder.

And I created utilities package which stores Configuration Reader to access to the Base URL and base PATH stored in configuration.properties file and used in test cases.

Thanks.

