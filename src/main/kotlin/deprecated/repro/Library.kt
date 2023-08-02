package deprecated.repro

private const val DeprecationMessage = "This is deprecated"

@Deprecated(DeprecationMessage + "Aloha!", ReplaceWith("3"))
public inline fun hello(): Int = 2
