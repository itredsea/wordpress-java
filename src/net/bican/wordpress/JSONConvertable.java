/*
 * This file is part of jwordpress.
 *
 * jwordpress is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * jwordpress is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with jwordpress.  If not, see <http://www.gnu.org/licenses/>.
 */
package net.bican.wordpress;

import org.json.JSONObject;

/**
 * 
 * Interface for objects that can be modified via JSON objects.
 * 
 * @author Can Bican &lt;can@bican.net&gt;
 * 
 */
public interface JSONConvertable {
  /**
   * @param jsonObject JSON object to get values from
   */
  public void fromJSONObject(JSONObject jsonObject);
}