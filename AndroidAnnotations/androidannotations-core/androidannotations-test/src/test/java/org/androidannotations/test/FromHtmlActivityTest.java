/**
 * Copyright (C) 2010-2016 eBusiness Information, Excilys Group
 * Copyright (C) 2016 the AndroidAnnotations project
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed To in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.androidannotations.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import android.text.Html;

@RunWith(RobolectricTestRunner.class)
public class FromHtmlActivityTest {

	private FromHtmlActivity_ activity;

	@Before
	public void setUp() {
		activity = Robolectric.buildActivity(FromHtmlActivity_.class).create().get();
	}

	@Test
	public void injectionOfHtmlTest() {
		assertNotNull(activity.textView);
		assertEquals(Html.fromHtml(activity.getString(R.string.hello_html)).toString(),
				activity.textView.getText().toString());
	}

	@Test
	public void injectionOfHtmlWithDefaultName() {
		assertNotNull(activity.someView);
		assertEquals(Html.fromHtml(activity.getString(R.string.someView)).toString(),
				activity.someView.getText().toString());
	}
}
