### File Uploading using <u>Standard</u>ServletMultipartResolver, configured with <u>AbstractAnnotationConfigDispatcherServletInitializer</u>

**Can upload 2 files at once!**

#### Significant configuration files:

- spittr.config.SpittrWebAppInitializer
  - sets the location of temp upload folder to *D:/d/data/temp/upload*
- spittr.config.WebConfig
  - registers multipartResolver bean

#### Other significant files

- /main/webapp/WEB-INF/views/registerForm.jsp
  - form enctype attribute
  - file input
- spittr.web.FileUploadController

This project only works on Servlet 3.0 supported servers and Spring 3.1+ like tomcat7 as StandardServletMultipartResolver is only supported since Servlet 3.0 and since Spring 3.1