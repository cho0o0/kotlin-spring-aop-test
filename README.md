# Kotlin Spring AOP Test Demo

![CI](https://github.com/cho0o0/kotlin-spring-aop-test/workflows/CI/badge.svg)

This is a demo repository showing the methods to test Aspects in Spring.

- Unit Test (`MyAspectUnitTest`): Use [`AspectJProxyFactory`](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/aop/aspectj/annotation/AspectJProxyFactory.html)
- Integration Test (`MyAspectIntegrationTest`): Use [`@EnableAspectJAutoProxy`](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/annotation/EnableAspectJAutoProxy.html)
