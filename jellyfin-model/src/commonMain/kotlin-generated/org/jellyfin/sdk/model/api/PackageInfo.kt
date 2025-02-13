// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
@file:UseSerializers(UUIDSerializer::class)

package org.jellyfin.sdk.model.api

import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import org.jellyfin.sdk.model.UUID
import org.jellyfin.sdk.model.serializer.UUIDSerializer

/**
 * Class PackageInfo.
 */
@Serializable
public data class PackageInfo(
	/**
	 * Gets or sets the name.
	 */
	@SerialName("name")
	public val name: String,
	/**
	 * Gets or sets a long description of the plugin containing features or helpful explanations.
	 */
	@SerialName("description")
	public val description: String,
	/**
	 * Gets or sets a short overview of what the plugin does.
	 */
	@SerialName("overview")
	public val overview: String,
	/**
	 * Gets or sets the owner.
	 */
	@SerialName("owner")
	public val owner: String,
	/**
	 * Gets or sets the category.
	 */
	@SerialName("category")
	public val category: String,
	/**
	 * Gets or sets the guid of the assembly associated with this plugin.
	 * This is used to identify the proper item for automatic updates.
	 */
	@SerialName("guid")
	public val guid: UUID,
	/**
	 * Gets or sets the versions.
	 */
	@SerialName("versions")
	public val versions: List<VersionInfo>,
	/**
	 * Gets or sets the image url for the package.
	 */
	@SerialName("imageUrl")
	public val imageUrl: String? = null,
)
