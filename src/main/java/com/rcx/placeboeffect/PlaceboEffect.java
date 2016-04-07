package com.rcx.placeboeffect;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = PlaceboEffect.MODID, version = PlaceboEffect.VERSION)
public class PlaceboEffect
{
    public static final String MODID = "PEmod";
    public static final String VERSION = "1.0";
    public static Logger logger = LogManager.getLogger(MODID);
    
    @EventHandler
    public void init(FMLPreInitializationEvent event)
    {
        logger.info("Overhauling vanilla code");
    }
    
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        logger.info("Adding second ore dictionary");
    }

    @EventHandler
    public void init(FMLPostInitializationEvent event)
    {
        logger.info("Synchronizing quantum renderer");
    }
}
