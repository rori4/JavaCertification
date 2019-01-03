package Example;
/* Assuming that the code uses valid thrower calls, what statements MUST be added to the above class?

public class A48_StockQuote {
    Stock stock;

    public StockQuote(Stock s) {
    }

    public void store() throws IOException {
        Util.store(stock);
    }

    public double computePrice() {
        return Helper.getPricer(stock).price();
    }
}


Structure

     com
      |
      |--Helper.class
      |
      |----enthu
              |
              |----Util.class
              |
              |--------rad
                        |
                        |---Stock.class

package com.enthu.rad.*;
import com.enthu.*;
package com.enthu.rad;
import com.*;
import java.io.*;
It is not required to import java.io.* or import java.io.IOException because java.io package is imported automatically.

*/
