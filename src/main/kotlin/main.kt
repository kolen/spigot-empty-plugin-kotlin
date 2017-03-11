package org.lolka.test_plugin
import org.bukkit.plugin.java.JavaPlugin

class TestPlugin() : JavaPlugin() {
        override fun onEnable() {
                println("Test test")
        }

        override fun onDisable() {}
}
