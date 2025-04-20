package name.roadmarkingmod.block;

import name.roadmarkingmod.RoadMarkingMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.GlazedTerracottaBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    // ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ 方块 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // gray_concrete黄线
    public static final Block X_WHITE_LINE = registerBlock("x_white_line",
            new GlazedTerracottaBlock(FabricBlockSettings.copyOf(Blocks.BLACK_GLAZED_TERRACOTTA)));

    // ↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑ 方块 ↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    // ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ 楼梯方块 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // gray_concrete黄线
    public static final Block CON_YELLOW_LINE = registerBlock("con_yellow_line",
            new StairsBlock(Blocks.STONE_STAIRS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)
                            .sounds(BlockSoundGroup.STONE)
                            .nonOpaque()));

    // gray_concrete黄线 老化1
    public static final Block CON_YELLOW_LINE_OLD1 = registerBlock("con_yellow_line_old1",
            new StairsBlock(Blocks.STONE_STAIRS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)
                            .sounds(BlockSoundGroup.STONE)
                            .nonOpaque()));

    // gray_concrete黄线 老化2
    public static final Block CON_YELLOW_LINE_OLD2 = registerBlock("con_yellow_line_old2",
            new StairsBlock(Blocks.STONE_STAIRS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)
                            .sounds(BlockSoundGroup.STONE)
                            .nonOpaque()));

    // gray_concrete白线
    public static final Block CON_WHITE_LINE = registerBlock("con_white_line",
            new StairsBlock(Blocks.STONE_STAIRS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)
                            .sounds(BlockSoundGroup.STONE)
                            .nonOpaque()));

    // gray_concrete白线 老化1
    public static final Block CON_WHITE_LINE_OLD1 = registerBlock("con_white_line_old1",
            new StairsBlock(Blocks.STONE_STAIRS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)
                            .sounds(BlockSoundGroup.STONE)
                            .nonOpaque()));

    // gray_concrete白线 老化2
    public static final Block CON_WHITE_LINE_OLD2 = registerBlock("con_white_line_old2",
            new StairsBlock(Blocks.STONE_STAIRS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)
                            .sounds(BlockSoundGroup.STONE)
                            .nonOpaque()));

    // gray_concrete白线 老化3
    public static final Block CON_WHITE_LINE_OLD3 = registerBlock("con_white_line_old3",
            new StairsBlock(Blocks.STONE_STAIRS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)
                            .sounds(BlockSoundGroup.STONE)
                            .nonOpaque()));

    // cyan_terracotta黄线
    public static final Block TE_YELLOW_LINE = registerBlock("te_yellow_line",
            new StairsBlock(Blocks.STONE_STAIRS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)
                            .sounds(BlockSoundGroup.STONE)
                            .nonOpaque()));

    // cyan_terracotta黄线 老化1
    public static final Block TE_YELLOW_LINE_OLD1 = registerBlock("te_yellow_line_old1",
            new StairsBlock(Blocks.STONE_STAIRS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)
                            .sounds(BlockSoundGroup.STONE)
                            .nonOpaque()));

    // cyan_terracotta黄线 老化2
    public static final Block TE_YELLOW_LINE_OLD2 = registerBlock("te_yellow_line_old2",
            new StairsBlock(Blocks.STONE_STAIRS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)
                            .sounds(BlockSoundGroup.STONE)
                            .nonOpaque()));

    // cyan_terracotta白线
    public static final Block TE_WHITE_LINE = registerBlock("te_white_line",
            new StairsBlock(Blocks.STONE_STAIRS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)
                            .sounds(BlockSoundGroup.STONE)
                            .nonOpaque()));

    // cyan_terracotta白线 老化1
    public static final Block TE_WHITE_LINE_OLD1 = registerBlock("te_white_line_old1",
            new StairsBlock(Blocks.STONE_STAIRS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)
                            .sounds(BlockSoundGroup.STONE)
                            .nonOpaque()));

    // cyan_terracotta白线 老化2
    public static final Block TE_WHITE_LINE_OLD2 = registerBlock("te_white_line_old2",
            new StairsBlock(Blocks.STONE_STAIRS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)
                            .sounds(BlockSoundGroup.STONE)
                            .nonOpaque()));

    // cyan_terracotta白线 老化3
    public static final Block TE_WHITE_LINE_OLD3 = registerBlock("te_white_line_old3",
            new StairsBlock(Blocks.STONE_STAIRS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)
                            .sounds(BlockSoundGroup.STONE)
                            .nonOpaque()));

    // 石头黄线
    public static final Block YELLOW_LINE = registerBlock("yellow_line",
            new StairsBlock(Blocks.STONE_STAIRS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)
                            .sounds(BlockSoundGroup.STONE)
                            .nonOpaque()));

    // 石头黄线 老化1
    public static final Block YELLOW_LINE_OLD1 = registerBlock("yellow_line_old1",
            new StairsBlock(Blocks.STONE_STAIRS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)
                            .sounds(BlockSoundGroup.STONE)
                            .nonOpaque()));

    // 石头黄线 老化2
    public static final Block YELLOW_LINE_OLD2 = registerBlock("yellow_line_old2",
            new StairsBlock(Blocks.STONE_STAIRS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)
                            .sounds(BlockSoundGroup.STONE)
                            .nonOpaque()));

    // 石头白线
    public static final Block WHITE_LINE = registerBlock("white_line",
            new StairsBlock(Blocks.STONE_STAIRS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)
                            .sounds(BlockSoundGroup.STONE)
                            .nonOpaque()));

    // 石头白线 老化1
    public static final Block WHITE_LINE_OLD1 = registerBlock("white_line_old1",
            new StairsBlock(Blocks.STONE_STAIRS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)
                            .sounds(BlockSoundGroup.STONE)
                            .nonOpaque()));

    // 石头白线 老化2
    public static final Block WHITE_LINE_OLD2 = registerBlock("white_line_old2",
            new StairsBlock(Blocks.STONE_STAIRS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)
                            .sounds(BlockSoundGroup.STONE)
                            .nonOpaque()));

    // 石头白线 老化3
    public static final Block WHITE_LINE_OLD3 = registerBlock("white_line_old3",
            new StairsBlock(Blocks.STONE_STAIRS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)
                            .sounds(BlockSoundGroup.STONE)
                            .nonOpaque()));

    // ↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑ 楼梯方块 ↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    // 注册方块
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK,
                new Identifier("road-marking-mod", name), block);
    }

    // 注册方块物品
    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM,
                new Identifier("road-marking-mod", name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register(entries -> entries.add(block));
    }

    public static void registerModBlocks() {
        RoadMarkingMod.LOGGER.info("Registering White Line Block...");
    }
}