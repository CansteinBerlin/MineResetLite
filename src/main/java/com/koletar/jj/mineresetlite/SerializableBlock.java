package com.koletar.jj.mineresetlite;

import org.bukkit.Material;

/**
 * @author jjkoletar
 */
public class SerializableBlock {
	private Material blockType;

	public SerializableBlock(Material blockType) {
		this.blockType = blockType;
	}
	
	public SerializableBlock(String blockType) {
		this.blockType = Material.valueOf(blockType);
	}

	public Material getBlock() {
		return blockType;
	}

	public String toString() {
		return blockType.toString();
	}

	public boolean equals(Object o) {
		return o instanceof SerializableBlock
				&& (this.blockType == ((SerializableBlock) o).blockType);
	}
}
