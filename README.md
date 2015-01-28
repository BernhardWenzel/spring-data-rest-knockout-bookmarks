# Example app that uses Java + Spring Data Rest and Knockout.js to create REST-based web app with minimal effort

This is the source code of a tutorial that can be found here: <http://bernhardwenzel.com/blog/2014/10/10/spring-boot-rest-knockout-bookmarks/>

Example Bookmark-application with separate backend and frontend. CORS enabled. 

Uses following frameworks:

* [Spring Boot](http://docs.spring.io/spring-boot/docs/1.2.1.RELEASE/reference/htmlsingle/)
* [Spring Data Rest] (http://docs.spring.io/spring-data/rest/docs/2.2.1.RELEASE/reference/html/)
* [Gradle](http://gradle.org/documentation)
* Java
* [Knockout.js frontend](http://knockoutjs.com/documentation/introduction.html)

## Usage

Run backend with

    $ gradle run

Fully functional REST backend api for booksmarks resource.

Open `index.html` in a Browser.

The web app looks like this:

![Bookmarks web app](http://www.bernhardwenzel.com/assets/images/bookmarks-frontend.png)

Note: Backend database is an in-memory H2 database. In order to keep data between session, it can be easily switched to file mode by un-commenting the lines in `src/main/resources/application.properties`.

More details can be found in the [tutorial](http://bernhardwenzel.com/blog/2014/10/10/spring-boot-rest-knockout-bookmarks).
