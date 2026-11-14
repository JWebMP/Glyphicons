package com.jwebmp.plugins.glyphicons.implementations;

import com.guicedee.client.services.config.IGuiceScanModuleExclusions;
import com.guicedee.client.services.config.IGuiceScanJarExclusions;
import java.util.LinkedHashSet;
import java.util.Set;

/** SPI services and direct resource access do not require scanning this library. */
public class GlyphiconsExclusionsModule implements IGuiceScanModuleExclusions<GlyphiconsExclusionsModule>, IGuiceScanJarExclusions<GlyphiconsExclusionsModule> {
    @Override public Set<String> excludeModules() { return Set.of("com.jwebmp.plugins.glyphicons"); }
    @Override public Set<String> excludeJars() {
        Set<String> jars = new LinkedHashSet<>();
        jars.add("glyphicons.jar");
        for (int digit = 0; digit <= 9; digit++) jars.add("glyphicons-" + digit + "*.jar");
        return jars;
    }
}
