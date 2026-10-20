plugins {
    id("dev.kikugie.stonecutter")
}

stonecutter active "1.21.1"

// See https://stonecutter.kikugie.dev/wiki/config/params
stonecutter parameters {
    swaps["version"] = "\"${property("mod.version")}\""
}
