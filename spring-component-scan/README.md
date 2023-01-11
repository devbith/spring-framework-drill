### What does component-scanning do?
- ComponentScanning
```
Process in which Spring is scanning Classpath in search for classes annotated with stereotypes annotations (@Component, @Repository, @Service, @Controller, ...) and based on those creates beans definitions.
Simple component scanning within Configuration package and all subpackages
```

- Simple component scanning within Configuration package and all subpackages
```
@ComponentScan
class AppConfig {
...
}
```

- AdvancedComponentScanningRules
```
@ComponentScan(
    basePackages = "com.sample",
    includeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern = ".*Bean"),
    excludeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern = ".*(Controller|Service).*")
)
class AppConfig {
...
}
```