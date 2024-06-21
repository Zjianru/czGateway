# About Request Mapping Handler

构造无参 GET 方法
```java
    // 无参get方法
        RequestMappingInfo requestMappingInfo = RequestMappingInfo.paths("/lmcTest").methods(RequestMethod.GET).build();
        bean.registerMapping(requestMappingInfo, "demoController", demoController.class.getDeclaredMethod("myTest"));
```

带一参数的 get 方法
```java
      // 带一参数的get方法
        RequestMappingInfo requestMappingInfo1 = RequestMappingInfo.paths("/lmcTest2").params(new String[]{"fileName"}).methods(RequestMethod.GET).build();
        bean.registerMapping(requestMappingInfo1, "demoController", demoController.class.getDeclaredMethod("myTest2", String.class));
```

带多个参数的 get 方法
```java
// 带多个参数的get方法
RequestMappingInfo requestMappingInfo2 = RequestMappingInfo.paths("/lmcTest3")
.params(new String[]{"fileName", "type", "isSort"})
.methods(RequestMethod.GET).build();
bean.registerMapping(requestMappingInfo2, "demoController", demoController.class.getDeclaredMethod("myTest3", String.class, String.class, Boolean.class));
```

Body 带数据的 POST 方法

```java
// body带参的post方法
RequestMappingInfo requestMappingInfo5 = RequestMappingInfo.paths("/lmcTest6")
.produces(new String[]{"text/plain;charset=UTF-8"})
.methods(RequestMethod.POST).build();
bean.registerMapping(requestMappingInfo5, "demoController", demoController.class.getDeclaredMethod("myTest4", HttpServletRequest.class));
System.err.println("已经加载/lmcTest");

```







