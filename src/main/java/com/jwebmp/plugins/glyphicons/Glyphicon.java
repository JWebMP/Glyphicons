package com.jwebmp.plugins.glyphicons;

import com.jwebmp.core.base.html.Span;
import com.jwebmp.core.base.html.attributes.NoAttributes;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.core.base.interfaces.IIcon;
import com.jwebmp.core.plugins.ComponentInformation;

/**
 * GLYPHICONS is a library of precisely prepared monochromatic icons and symbols,
 * created with an emphasis on simplicity and easy orientation.
 */
@ComponentInformation(name = "Glyphicons",
		description = "GLYPHICONS is a library of precisely prepared monochromatic icons and symbols, created with an emphasis to simplicity and easy orientation.",
		url = "http://glyphicons.com/")
public class Glyphicon<J extends Glyphicon<J>>
		extends Span<IComponentHierarchyBase<?,?>, NoAttributes, J>
	implements IIcon<IComponentHierarchyBase<?,?>, J>
{
	private Glyphicons icon;

	public Glyphicon(Glyphicons icon)
	{
		this.icon = icon;
	}

	@Override
	public void preConfigure()
	{
		if (!isConfigured())
		{
			addClass(icon.toString());
		}
		super.preConfigure();
	}

	public Glyphicons getIcon()
	{
		return icon;
	}

	@SuppressWarnings("unchecked")
	public J setIcon(Glyphicons icon)
	{
		this.icon = icon;
		return (J) this;
	}

	@Override
	public String getClassName()
	{
		return icon.toString();
	}

	@Override
	public IComponentHierarchyBase<?,?> getIconComponent()
	{
		return this;
	}
}
