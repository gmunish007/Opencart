package Utilities;

import org.testng.annotations.DataProvider;

import java.io.IOException;

public class DataProviders {

    @DataProvider(name = "LoginData")
    public String[][] getData() throws IOException {
        String path = ".\\testData\\LoginData.xlsx";
        ExcelUtility xlUtil = new ExcelUtility(path);

        int totalRow = xlUtil.getRowCount("Sheet1");
        int totalCell = xlUtil.getCellCount("Sheet1", 1);

        String loginData[][] = new String[totalRow][totalCell];

        for (int i = 1; i <= totalRow; i++) {
            for (int j = 0; j <= totalCell; j++) {
                loginData[i - 1][j] = xlUtil.getCellData("Sheet1", i, j);
            }
        }
        return loginData;
    }
}
