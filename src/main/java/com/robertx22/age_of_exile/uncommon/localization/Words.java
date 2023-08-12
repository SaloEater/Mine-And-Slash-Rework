package com.robertx22.age_of_exile.uncommon.localization;

import com.robertx22.age_of_exile.mmorpg.SlashRef;
import com.robertx22.age_of_exile.uncommon.interfaces.IAutoLocName;

import java.util.Locale;

public enum Words implements IAutoLocName {
    AddSocket("Adds a socket"),
    Nothing("Nothing"),

    UpgradeAffix("Upgrades an affix"),
    DowngradeAffix("Downgrades an affix"),

    DestroyProtect("Destruction Guard"),
    WipeUpgradeProtect("Upgrade Guard"),
    SafeguardsLeft("Safeguards Left:"),
    FailedButSafe("Upgrade failed but the Protection Scroll effect safeguarded the item."),
    UpgradeStone("Upgrade Stone"),
    Essence("Essence"),
    EmptyString(" "),
    GearHasData("The used gear has stats already"),
    NoGear("This recipe requires gear as ingredient"),
    WrongIngredient("You can't use use that item in this recipe."),
    WrongRecipeIngredient("That ingredient isn't usable in this profession."),
    CantUseMoreOf("Can't use more than 1 ingredient of that type."),
    NoIngredients("No Ingredients."),

    ArmorCraftingDesc("Combine an Armorer's Cloth with a piece of armor and some materials to enchant that item with stats. "),
    JewelCraftingDesc("Combine a Jeweler's Tool with a ring or necklace and some materials to enchant that item with stats."),
    WeaponCraftingDesc("Combine a Weapon Crafter's Hammer with a weapon and some materials to enchant that item with stats."),

    Ingredient("Crafting Ingredient"),
    ArmorCrafting("Armor Crafting"),
    JewelCrafting("Jewel Crafting"),
    WeaponCrafting("Weapon Crafting"),

    Soul("Soul"),
    Solo("Solo"),
    Duo("Duo"),
    Team("Team"),
    DungeonKey("Dungeon Key"),
    SavesNamedOrEnchanted("Doesn't auto salvage named or enchanted items."),
    BagUpgradeDesc("Backpack Upgrade Item."),
    BlacksmithDesc("Blacksmithing turns stones and minerals into useful tools."),
    Professions("Professions"),
    Wiki("Wiki"),
    CorruptedExplanation1("Use Orb of Purification to clear corruption."),
    CorruptedExplanation2("Item won't provide any stats until purified."),
    Corrupted("Corrupted"),
    Exploration("Exploration"),
    Blacksmithing("Blacksmithing"),
    Fishing("Fishing"),
    Inscribing("Inscribing"),
    Cooking("Cooking"),
    Skills("Skills"),
    AscClasses("Classes"),
    Mining("Mining"),
    Farming("Farming"),
    Salvaging("Salvaging"),
    SkillGem("Skill Gem"),
    Gear("Gear"),
    All("All"),
    Skill("Skill"),
    Rune("Rune"),
    LevelRewards("Level Rewards"),
    Gem("Gem"),
    Small("Small"),
    Big("Big"),
    CreatedInSalvageStation("Created in Salvage Station."),
    IsSealed("Is sealed"),
    Sealed("Sealed"),
    AltDescShiftDetails("[Shift]: Details"),
    SkillTrees("Skill Trees"),
    Miracle("Miracle"),
    Oblivion("Oblivion"),
    Beast("Beast"),
    Golem("Golem"),
    Spirit("Spirit"),
    Rage("Rage"),
    Durability("Durability"),

    Beads("Beads"),
    Charm("Charm"),
    Locket("Locket"),
    //
    Band("Band"),
    Eye("Eye"),
    Loop("Loop"),
    //
    Crown("Crown"),
    Circlet("Circlet"),
    Horn("Horn"),
    //
    Cloak("Cloak"),
    Coat("Coat"),
    Mantle("Mantle"),
    Shell("Shell"),
    //
    Aegis("Aegis"),
    Barrier("Barrier"),
    Guard("Guard"),
    Tower("Tower"),
    //
    Slippers("Slippers"),
    Road("Road"),
    Hoof("Hoof"),
    Dash("Dash"),
    //

    Bane("Bane"),
    Bite("Bite"),
    Wind("Wind"),
    Star("Star"),
    Splitter("Splitter"),
    //
    Legguards("Legguards"),
    Leggings("Leggings"),
    Robes("Robes"),
    Britches("Britches"),
    Legwraps("Legwraps"),
    //
    Creation("Creation"),

    // name2

    Trickery("Trickery"),

    Bravery("Bravery"),

    Wizardry("Wizardry"),

    CooldownSeconds("Cooldown Seconds"), NatureBalm("Nature's Balm"),

    CooldownTicks("Cooldown Ticks"),
    CastSpeed("Cast Speed"),
    ManaCost("Mana Cost"),
    ProjectileSpeed("Projectile Speed"),
    Cooldown("Cooldown"),
    Damage("Damage"), Healing("Healing"),

    CastTimeTicks("Cast Time Ticks"),

    Radius("Radius"),

    ProjectileCount("Projectile Count"),

    ShootSpeed("Shoot Speed"),

    SummonedEntities("Summoned Entities"),

    Chance("Chance"),

    IsNotMaxRarity("Is not max rarity."),
    IsNotMaxTier("Is not max tier."),

    CooldownReductionEfficiency("Cooldown Reduction Efficiency"),

    DurationTicks("Duration in Ticks"),

    TickRate("Tick Rate"),

    TimesToCast("Times to Cast"),
    Technique("Technique"),
    Amount("Amount"),

    KillBoss("Kill Boss: "), BlinkStrike("Blink Strike"),

    Kill("Kill"),

    Magic_Missile("Magic Missiles"),

    Arcanist("Arcanist"),

    OpenAnyLootCrates("Open Any Loot Crates"),

    Fire("Fire"), Mastery("Mastery"),

    Ocean("Ocean"), Hunting("Hunting"),

    Rogue("Rogue"),

    Storm("Storm"), Divine("Divine"),

    Nature("Nature"),

    Cleric("Cleric"),

    ClickToOpen("Click to Open"),

    Spellbar("Spellbar"),

    StormCloudSpellDesc("Summons a storm cloud that deals damage over time."),

    Crate("Crate"),

    MythicCrate("Mythic Crate"),

    JewerlyCrafterCrate("Jewerly Crafter's Crate"),

    ArmorCrafterCrate("Armor Crafter's Crate"),

    WeaponcraftersCrate("Weapon Crafter's Crate"),

    Talents("Talents"),

    StatOverview("Stat Info"),

    StatPoints("Stat Points"),

    MapInfo("Map Info"),
    Loadouts("Loadouts"),

    Compendium("Compendium"),

    KillMobsCollectRarityPoints("Kill mobs, collect rarity points!"),

    KillMobs("Kill Mobs"),

    Bad("Bad"),

    Good("Good"),

    PassiveSkill("Passive Skill"),
    PassiveDesc("Casted when hit by mob at low health."),
    Average("Average"),

    Great("Great"),

    Amazing("Amazing"),

    CurrencyCrate("Crafter's Paradise Crate"),

    RuneCrate("Runecrafter's Crate"),

    CartographerCrate("Cartographer's Crate"),

    CommonerCrate("Commoner's Dream Crate"),

    UniqueCrate("Pharaoh Crate"),

    PressAltForStatInfo("Press Alt for Stat Desc"),

    MustBeMap("Must be an Adventure Map"),

    MustBeGear("Must be a Gear Item"),
    MustBeSpellGem("Must be a Spell Gem Item"),

    NotSpell("Not a Spell Item"),

    NotRune("Not a Rune Item"),

    Locked("Locked"),

    Broken("Broken"),

    Alchemy("Alchemy"),

    InstabilityLimitReached("Instability Limit Reached"),


    CurrentMapInfo("Current Map Info"),

    Decreased("Decreased"),

    Increased("Increased"),

    Flat("Flat"),

    PressShiftForRequirements("Press Shift for Requirements"),

    isUnique("Is Unique"),

    hasMatchingRunes("Matching Runes are in gear"),

    hasUniqueStats("Has Unique stats"),

    hasSet("Has Set"),

    hasPrimaryStats("Has Primary Stats"),

    hasSuffix("Has Suffix"),

    hasPrefix("Has Prefix"),

    isNotUnique("Is Not Unique"),

    IsCommon("Is Common Rarity"),

    LvlLessThanMax("Lvl less than max lvl"),

    NoSuffix("Doesn't have suffix"),
    HasHigherRarity("Has higher rarity"),
    CantGetMoreAffixes("Can't get more affixes."),
    UpgradeLvlTo5("Upgrade Level must be 0-4"),
    UpgradeLvlTo10("Upgrade Level must be 5-9"),
    UpgradeLvlTo15("Upgrade Level must be 10-14"),

    HasEmptyUpgrades("Has empty upgrade slots"),
    HasGreenUpgrades("Has green upgrade slots"),
    HasBlueUpgrades("Has blue upgrade slots"),

    HasEmptySockets("Has Empty Sockets"),
    HasUpgradeSlotsLeft("Has Upgrade Slots Left"),
    IsNotCorrupted("Is not corrupted"),

    CanGetMoreSockets("Can get more sockets "),

    NoDuplicateSockets("No Duplicate Sockets"),

    NoPrefix("Doesn't have prefix"),

    TierLessThanMax("Tier less than maximum"),

    OnHit("On Hit"),

    OnExpire("On Expire"),

    PerEntityHit("Per Entity Hit"),

    AllowedOn("Allowed on"),

    NotAllowedOn("Not Allowed on: "),

    Unique_Gear("Unique Gear"),

    Normal_Gear("Normal Gear"),

    Runed_Gear("Runed Gear"),

    PicksUpItemsAuto("Automatically picks up certain items!"),

    HoldToPreventPickup("Hold in your hand to prevent item pickup."),

    AddRarestAffixes("Add Rarest Affixes"),
    RepairKit1("Craft with gear to repair."),
    RepairKit2("Craft with fuel mat to charge."),
    Requirements("Requirements"),
    RequiresLevel("Requires Level"),

    RequirementsNotMet("Requirements not met"),

    Blueprint("Blueprint"),

    AddMajorArcana("Add Major Arcana Chaos Stats"),

    AlwaysMythicAffixes("Always has Mythic Affixes"),

    AlwaysChaosStats("Always has Chaos Stats"),

    AlwaysSet("Always has Set"),

    Armor("Armor"),

    ChanceToUpgrade("Chance to Upgrade"),

    Weapon("Weapon"),

    WeaponOffhand("Weapon/Offhand"),

    Jewerly("Jewerly"),

    Offhand("Offhand"),

    Modifier("Modifier"),

    RunesNeeded("Runes needed"),

    IsAtool("Is a Tool"),
    LessThan3Upgrade("Has less than 3 upgrades"),

    Press_Shift_For_Setup_Info("Press Shift For Setup Info"),

    Press_Shift_For_More_Info("Press Shift For More Info"),

    Penetration("Penetration"),

    Core_Stat("Core Stat"),

    Elemental_Attack_Damage("Elemental Attack Damage"),

    Main("Main"),

    Unidentified("Unidentified"),

    Activation_Time("Activation Time"),

    Animal("Animal"),

    Attack("Attack"),

    BaseValue("Base Value"),

    Works_when_equipped("Works when equipped"),
    Block("Block"),
    Blocks("Blocks"),

    Loot("Loot"), Exp("Exp"),

    Bonus_Salvage_Chance("Bonus Salvage Chance"),

    Bonus_Success_Rate("Bonus Success Rate"),

    By("By"),

    Chaos_Stats("Chaos Stats"),

    Currency("Currency"),
    Backpack("Backpack"),

    Dealt("Dealt"),

    Defenses("Defenses"),

    Distance("Distance"),

    Empty("Empty"),

    From("From"),

    Fuel("Fuel"),

    Gears("Gears"),

    Infusion("Infusion"),

    Item("Item"),

    SocketLvlIsntHigherThanItemLvl("Socket lvl not higher than gear lvl"),

    Left("Left"),

    Level("Level"),

    Mana_Cost("Mana Cost"),

    Map("Map"),

    Maps("Maps"),

    Minutes("Minutes"),

    Misc("Misc"),
    Affixes_Affecting_All("All"),

    Mob("Mob"),

    Mob_Affixes("Mob Affixes"),

    Multi("Multi"),

    None("None"),

    Npc("Npc"),

    Percent("Percent"),

    GroupPlay("Group Play"),

    PartySize("Party Size"),

    Player_Affixes("Player Affixes"),

    Position("Position"),

    Prefix("Prefix"),

    Primary_Stats("Primary Stats"),

    Progress("Progress"),

    Put_Map("Put Map"),

    Rarity("Rarity"),

    Regeneration("Regenerate"),

    Resources("Resources"),

    Runed("Runed"),

    Runes("Runes"),

    Runeword("Runeword"),

    Sacrifice_Map_For_Level("Sacrifice Map For Level"),

    Sacrifice_Map_For_Tier("Sacrifice Map For Tier"),

    Scaling_Value("Scaling Value"),

    Secondary_Stats("Secondary Stats"),

    Seconds("Seconds"),

    Set("Set"),

    Socket("Socket"),

    Sockets("Sockets"),

    Spell("Spell"),

    Spell_Damage("Spell Damage"),

    Spells("Spells"),

    Start("Start"),
    Character("Character"),
    Stats("Stats"),

    Suffix("Suffix"),

    SpiritWolves("Spirit Wolves"),

    Tier("Tier"),

    To("To"),

    Took("Took"),

    Type("Type"),

    Unique_Stats("Unique Stats"),

    Unsalvagable("Unsalvagable"),

    UsableOn("Usable on"),

    Use_Time("Use Time"),

    Uses("Uses"),

    Beware("Beware"),

    World_Type("World Type"),

    Repair_Station("Repair Station");

    private String localization = "";

    Words(String str) {
        this.localization = str;

    }

    @Override
    public AutoLocGroup locNameGroup() {
        return AutoLocGroup.Words;
    }

    @Override
    public String locNameLangFileGUID() {
        return SlashRef.MODID + ".word." + GUID();
    }

    @Override
    public String locNameForLangFile() {
        return localization;
    }

    @Override
    public String GUID() {
        return this.name()
                .toLowerCase(Locale.ROOT);
    }
}
