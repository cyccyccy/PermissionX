# PermissionX

PermissionX 是一个用于简化Android运行时权限用法的开源库

可添加如下配置江PermissionX引入到你的项目中：
```groovy
dependencies {
	...
	implementation 'com.permissionx.cyclibrary:cycPermissionX:1.0.0'
}
```

然后就可以使用如下语法结构来申请运行时权限了：

```kotlin
PermissionX.request(this,Manifest.permission.CALL_PHONE){allGranted,deniedList ->
   if (allGranted){
       Toast.makeText(this,"all permission are granted",Toast.LENGTH_SHORT).show()
    }else{
       Toast.makeText(this,"you denied $deniedList",Toast.LENGTH_SHORT).show()
    }
}
```
