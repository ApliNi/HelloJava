## TestPlugin

我的第一个 Minecraft 插件, 不过没什么有用的功能. 

---

本机版本: [1.19], 经过测试的版本: [1.19, 1.19.2].  


**功能**
1. 编辑玩家加入消息
2. 编辑玩家退出消息


**指令**
- `/testplugin` 显示插件信息
  - `/testplugin reload` 重新加载配置


**配置**
```yaml
config-version: 0

# 插件指令: /testplugin
# 留空 "" 以禁用功能. 可使用的变量:
#   {player.name}   = 玩家名称


# 玩家加入消息
player-join:
  broadcast: "{player.name} 加入了服务器"

# 玩家退出消息
player-quit:
  broadcast: "{player.name} 跑了"
```
