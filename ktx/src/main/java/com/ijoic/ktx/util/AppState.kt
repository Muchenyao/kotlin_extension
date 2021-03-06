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
package com.ijoic.ktx.util

import android.content.Context
import java.lang.ref.WeakReference

/**
 * Application state.
 *
 * @author verstsiu on 2018/6/22.
 * @version 1.0
 */
object AppState {
  private var refContext: WeakReference<Context>? = null

  /**
   * Bind application context.
   *
   * @param context context.
   */
  @JvmStatic
  fun bindContext(context: Context) {
    refContext = WeakReference(context.applicationContext)
  }

  /**
   * Returns application context if exist.
   */
  @JvmStatic
  fun getContext(): Context? {
    return refContext?.get()
  }
}