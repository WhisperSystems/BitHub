/**
 * Copyright (C) 2013 Open WhisperSystems
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.whispersystems.bithub.config;


import com.fasterxml.jackson.annotation.JsonProperty;

import org.hibernate.validator.constraints.NotEmpty;

import java.math.BigDecimal;

public class BithubConfiguration {

  @JsonProperty
  @NotEmpty
  private String payout = "0.02";

  // This is the number of decimal places shown when displaying amounts in BTC
  // Change this if needed to whatever is appropriate for your payout amounts
  @JsonProperty
  @NotEmpty
  private int btcPrecision = 4;

  public BigDecimal getPayoutRate() {
    return new BigDecimal(payout);
  }

  public int getBtcPrecision() {
    return btcPrecision;
  }

}
