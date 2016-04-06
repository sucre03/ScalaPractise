/**
  * 第一组 println 语句非直接地对 get 返回的实例执行了 toString 方法。
  * 事实上，我们是在对 Some 或 None 执行 toString 方法，因为当映射表中存在 key 对应的值时，
  * Map.get 的返回值被自动包装在 Some 对象中。相反，当我们请求了一个映射表中不存在的数据时，
  * Map.get 就返回 None，而不是 null，最后一个 println 就是这种情况。

    第二组 println 更进一步，调用 Map.get 后，又对 Option 实例调用了 get
    或 getOrElse，以取出其中包含的值。
  */
val stateCapitals =Map(
  "Alabama"->"Montgomery",
  "Alaska"->"Juneau",
  "Wyoming"->"Cheyenne"
)
println( "Get the capitals wrapped in Options:" )
println( "Alabama: " + stateCapitals.get("Alabama") )
println( "Wyoming: " + stateCapitals.get("Wyoming") )
println( "Unknown: " + stateCapitals.get("Unknown").getOrElse("haha") )

println( "Get the capitals themselves out of the Options:" )
println( "Alabama: " + stateCapitals.get("Alabama").get )
//使用Option中的getOrElse防止空指针的出现
println( "Wyoming: " + stateCapitals.get("Wyoming").getOrElse("Oops!") )
println( "Unknown: " + stateCapitals.get("Unknown").getOrElse("Oops2!") )