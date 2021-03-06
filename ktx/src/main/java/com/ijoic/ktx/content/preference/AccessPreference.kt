/*
 *
 *  Copyright(c) 2018 VerstSiu
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package com.ijoic.ktx.content.preference

import android.content.Context

/**
 * Access preference.
 *
 * @author verstsiu on 2018/7/7.
 * @version 1.0
 */
abstract class AccessPreference(context: Context, name: String, accessMode: Int = Context.MODE_PRIVATE) {
  /**
   * Shared preferences.
   */
  internal val prefs = context.getSharedPreferences(name, accessMode)

  /**
   * Inner shared preferences.
   */
  protected val innerPrefs = prefs

  /**
   * Reset saved prefs item.
   *
   * @param key item key.
   */
  fun reset(key: String) {
    prefs.applyRemove(key)
  }

  /**
   * Clear all prefs contents.
   */
  fun clear() {
    prefs.applyClear()
  }
}