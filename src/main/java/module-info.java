import com.jwebmp.plugins.glyphicons.implementations.GlyphiconInclusionModule;

module com.jwebmp.plugins.glyphicons {
	exports com.jwebmp.plugins.glyphicons;

	requires com.jwebmp.core;
	requires com.jwebmp.core.base.angular.client;
	requires com.guicedee.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.glyphicons.GlyphiconsPageConfigurator;
	provides com.guicedee.client.services.config.IGuiceScanModuleExclusions with com.jwebmp.plugins.glyphicons.implementations.GlyphiconsExclusionsModule;
	provides com.guicedee.client.services.config.IGuiceScanModuleInclusions with GlyphiconInclusionModule;

	opens com.jwebmp.plugins.glyphicons to com.fasterxml.jackson.databind, com.jwebmp.core;
}
