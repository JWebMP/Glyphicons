module com.jwebmp.plugins.glyphicons {
	exports com.jwebmp.plugins.glyphicons;

	requires com.jwebmp.core;
	requires com.jwebmp.core.base.angular.client;
	requires com.guicedee.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.glyphicons.GlyphiconsPageConfigurator;
	provides com.guicedee.client.services.config.IGuiceScanModuleExclusions with com.jwebmp.plugins.glyphicons.implementations.GlyphiconsExclusionsModule;

	opens com.jwebmp.plugins.glyphicons to tools.jackson.databind, com.jwebmp.core;

    provides com.guicedee.client.services.config.IGuiceScanJarExclusions with com.jwebmp.plugins.glyphicons.implementations.GlyphiconsExclusionsModule;
}
