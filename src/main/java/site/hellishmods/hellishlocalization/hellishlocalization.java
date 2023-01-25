package site.hellishmods.hellishlocalization;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod("hellishlocalization")
public class hellishlocalization
{
    public hellishlocalization() {
        // Register mod lmao
        MinecraftForge.EVENT_BUS.register(this);
    }
}
