package com.jwebmp.plugins.glyphicons;

import com.jwebmp.core.base.angular.client.annotations.angularconfig.NgStyleSheet;
import com.jwebmp.core.base.angular.client.annotations.typescript.TsDependency;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.PluginStatus;
import com.jwebmp.core.services.IPage;
import com.jwebmp.core.services.IPageConfigurator;

/**
 * Page configurator for Glyphicons — registers glyphicons-only-bootstrap CSS via npm.
 */
@PluginInformation(pluginName = "Glyphicons",
		pluginUniqueName = "glyphicons",
		pluginDescription = "GLYPHICONS is a library of precisely prepared monochromatic icons and symbols, created with emphasis on simplicity and easy orientation. Includes 250+ icons from Bootstrap 3.",
		pluginVersion = "1.9.2",
		pluginDependancyUniqueIDs = "",
		pluginCategories = "fonts, icons",
		pluginSubtitle = "GLYPHICONS — monochromatic icons and symbols for web applications",
		pluginGitUrl = "https://github.com/JWebMP/JWebMP",
		pluginSourceUrl = "http://glyphicons.com/",
		pluginWikiUrl = "https://github.com/JWebMP/JWebMP/wiki",
		pluginOriginalHomepage = "http://glyphicons.com/",
		pluginDownloadUrl = "https://mvnrepository.com/artifact/com.jwebmp.plugins/glyphicons",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginLastUpdatedDate = "2026/05/09",
		pluginGroupId = "com.jwebmp.plugins",
		pluginArtifactId = "glyphicons",
		pluginModuleName = "com.jwebmp.plugins.glyphicons",
		pluginStatus = PluginStatus.Released
)
@TsDependency(value = "glyphicons-only-bootstrap", version = "^1.0.1")
@NgStyleSheet("node_modules/glyphicons-only-bootstrap/css/bootstrap.min.css")
public class GlyphiconsPageConfigurator
		implements IPageConfigurator<GlyphiconsPageConfigurator>
{
	@Override
	public IPage<?> configure(IPage<?> page)
	{
		return page;
	}

	@Override
	public boolean enabled()
	{
		return true;
	}
}
