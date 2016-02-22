# DataBindingDemo
从MVC->MVP->MVVM，Android设计模式一直在进步。谈到MVVM，势必就要设计到data binding。Google还没有推送正式版的data binding，不过这并不妨碍写个小Demo来测试一下data binding的用法。

修改gradle文件，开启Data Binding：

```
android {
    ....
    dataBinding {
        enabled = true    
    }    
}
```