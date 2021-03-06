/**
 *   Copyright 2012 Quest Software, Inc.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.quest.oraoop.systemtest.util;


/**
 * Generates Blob test data.
 * 
 * @author phall
 */
public class BytesGenerator extends TestDataGenerator<byte[]> {
	private int minBytes;
	private int maxBytes;

	/**
	 * Create a generator that will generate arrays of bytes with length varying between minBytes and maxBytes.
	 * 
	 * @param minBytes
	 *            Minimum number of bytes in generated RAWs
	 * @param maxBytes
	 *            Maximum number of bytes in generated RAWs
	 */
	public BytesGenerator(int minBytes, int maxBytes) {
		super();
		this.minBytes = minBytes;
		this.maxBytes = maxBytes;
	}

	@Override
	public byte[] next() {
		int rawSize = (int) (rng.nextDouble() * (maxBytes - minBytes) + minBytes);
		byte[] rawData = new byte[rawSize];
		rng.nextBytes(rawData);

		return rawData;
	}

}
