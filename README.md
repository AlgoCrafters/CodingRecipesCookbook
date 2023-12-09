# CodingRecipesCookbook
## Overview
This project is a sample implementation of a Java backend application based on Spring frameworks.

The app contains a collection of coding techniques and a technology stack and typical layers of a cloud backend application.

The application is based on SpringBoot 3.2.0 with embedded Tomcat server and compiles with Java 17.

## Status and change history
As of December 2023, the project is in its inception phase with an intention to build a full scale backend 
demo application showcasing a typical technology stack of an enterprise cloud application such as security, API, 
access control, persistence to relational and no-SQL databases, messaging, integrations, logging, observability, etc.

## Description
The v0.1 is effectively the initial commit. The application builds, runs, and returns a response to its single API endpoint: /v1/public/appinfo

The app replaces the default Spring security configuration - see the `ApiSecurityConfiguration` class.
Access to the single API is permitted without any authentication/authorization.

**Note**: the context path is set to /demo-spring-app/api. The request paths for the security matchers must exclude the context path.

