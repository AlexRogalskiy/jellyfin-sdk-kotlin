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
 * Class CountryInfo.
 */
@Serializable
public data class CountryInfo(
	/**
	 * Gets or sets the name.
	 */
	@SerialName("Name")
	public val name: String? = null,
	/**
	 * Gets or sets the display name.
	 */
	@SerialName("DisplayName")
	public val displayName: String? = null,
	/**
	 * Gets or sets the name of the two letter ISO region.
	 */
	@SerialName("TwoLetterISORegionName")
	public val twoLetterIsoRegionName: String? = null,
	/**
	 * Gets or sets the name of the three letter ISO region.
	 */
	@SerialName("ThreeLetterISORegionName")
	public val threeLetterIsoRegionName: String? = null,
)
