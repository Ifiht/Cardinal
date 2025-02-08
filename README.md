# ![JUnit Tests](https://github.com/Ifiht/Cardinal/actions/workflows/gradle.yml/badge.svg)


# Cardinal

Master plugin for Ithavollr. As time goes on, more of the plugin deps below will be merged within #amoeba 🦠

_For config files, use `git update-index --skip-worktree <file_name>` to ignore future changes!!_

## Current Plugins:
| Plugin                                                             | Version | Folia Support? | Description                                                    | Gradle build string                                                                                              |
|--------------------------------------------------------------------|---------|----------------|----------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------|
| AutoStop                                                           | 1.2.0   | `Y`            | plugin that auto-stops server 3 seconds after startup finishes | `github("Ifiht", "AutoStop", "v1.2.0", "AutoStop-1.2.0.jar")                                                   ` |
| [AuraSkills](https://github.com/Ifiht/AuraSkills)                  | 2.2.4   | `N`            | Allows RPG-like growth.                                        | `modrinth("auraskills", "2.2.4")                                                                               ` |
| [AuraMobs](https://github.com/Ifiht/AuraMobs)                      | 4.0.8   | `N`            | Scales mobs based off player levels and distance from spawn    | `url("https://github.com/Ifiht/Cardinal/raw/refs/heads/main/plugin_jars/mc1-21-1/AuraMobs-4.0.8.jar")          ` |
| Chest Sort                                                         | 14.1.2  | `N`            | Automatic chest & inventory sorting                            | `url("https://github.com/Ifiht/Cardinal/raw/refs/heads/main/plugin_jars/mc1-21-1/ChestSort-14.1.2.jar")        ` |
| Chunky                                                             | 1.4.28  | `Y`            |                                                                | `modrinth("chunky", "1.4.28")                                                                                  ` |
| DeathChest                                                         | 2.2.7   | `N`            | Save items on death, in a chest                                | `hangar("DeathChest", "2.2.7")                                                                                 ` |    
| Decent Holograms                                                   | 2.8.11  | `Y`            |                                                                | `modrinth("decentholograms", "2.8.11")                                                                         ` |
| DiscordSRV                                                         | 1.28.0  | `Y`            | Discord integration                                            | `modrinth("discordsrv", "1.28.0")                                                                              ` |
| Distant Horizons                                                   | 0.6.1   | `N`            | LoD server-side manager for DH client mod                      | `url("https://github.com/Ifiht/Cardinal/raw/refs/heads/main/plugin_jars/mc1-21-1/DHS-0.6.1_for_MC-1.21.1.jar") ` |
| Interaction Visualizer                                             | 1.18.11 | `N`            |                                                                | `modrinth("interactionvisualizer", "1.10.16")                                                                  ` |
| LuckPerms                                                          | 5.4.131 | `N`            | Permissions Manager                                            | `url("https://github.com/Ifiht/Cardinal/raw/refs/heads/main/plugin_jars/mc1-21-1/LuckPerms-Bukkit-5.4.131.jar")` |
| [Lunamatic](https://github.com/Ifiht/Lunatic)                      | 1.0.1   | `Y`            | Nice effects & mechanics for full & new moons.                 | `modrinth("lunamatic", "1.0.1")                                                                                ` |
| Multiverse-Core                                                    | 4.3.14  | `N`            |                                                                | `hangar("multiverse-core", "4.3.14")                                                                           ` |
| Multiverse-Portals                                                 | 4.2.3   | `N`            |                                                                | `hangar("multiverse-portals", "4.2.3")                                                                         ` |
| Multiverse-Inventories                                             | 4.2.6   | `N`            |                                                                | `hangar("multiverse-inventories", "4.2.6")                                                                     ` |
| Multiverse-Netherportals                                           | 4.2.3   | `N`            |                                                                | `hangar("multiverse-netherportals", "4.2.3")                                                                   ` |
| [OpeNLogin](https://github.com/Ifiht/OpeNLogin)                    | 4.0.0   | `Y`            | Login manager revamped for Ithavollr.                          | `url("https://github.com/Ifiht/OpeNLogin/releases/download/v4.0.0/OpenLogin-4.0.0.jar")                        ` |
| SeeMore                                                            | 1.0.2   | `N`            | Set server-side view distance from client settings             | `modrinth("seemore", "1.0.2")                                                                                  ` | 
| Skins Restorer                                                     |         |                |                                                                |                                                                                                                  |
| [Simple Voice Chat](https://modrinth.com/plugin/simple-voice-chat) | 2.5.26  | `Y`            | MC voice chat                                                  | `modrinth("simple-voice-chat", "bukkit-2.5.26")                                                                ` |
| squaremap                                                          | 1.3.2   | `Y`            | World map viewer                                               | `url("https://cdn.modrinth.com/data/PFb7ZqK6/versions/2WtLC9mv/squaremap-paper-mc1.21.1-1.3.2.jar")            ` |
| Toolstats                                                          | 1.8.2   | `Y`            |                                                                | `modrinth("toolstats", "1.8.2")                                                                                ` |
| [WorldEdit](https://modrinth.com/plugin/worldedit)                 | 7.3.8   | `N`            | In-game map editor                                             | `url("https://cdn.modrinth.com/data/1u6JkXh5/versions/ecqqLKUO/worldedit-bukkit-7.3.8.jar")                    ` |
| [WorldGuard](https://modrinth.com/plugin/worldguard)               | 7.0.12  | `N`            | Anti-grief plugin                                              | `modrinth("worldguard", "7.0.12")                                                                              ` |

## Planned Plugins:
- [Citizens2](https://github.com/CitizensDev/Citizens2)