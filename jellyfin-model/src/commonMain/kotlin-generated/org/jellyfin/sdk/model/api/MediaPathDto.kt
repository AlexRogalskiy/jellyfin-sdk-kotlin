// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.sdk.model.api

import kotlin.String
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Media Path dto.
 */
@Serializable
public data class MediaPathDto(
	/**
	 * Gets or sets the name of the library.
	 */
	@SerialName("Name")
	public val name: String,
	/**
	 * Gets or sets the path to add.
	 */
	@SerialName("Path")
	public val path: String? = null,
	/**
	 * Gets or sets the path info.
	 */
	@SerialName("PathInfo")
	public val pathInfo: MediaPathInfo? = null,
)
