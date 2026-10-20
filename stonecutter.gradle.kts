plugins {
    id("dev.kikugie.stonecutter")
}

stonecutter active "26.1.2"

// See https://stonecutter.kikugie.dev/wiki/config/params
stonecutter parameters {
    swaps["version"] = "\"${property("mod.version")}\""
}
