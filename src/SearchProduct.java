public class SearchBar {


    public String searchBarSKU() {
        String sku = "I3090045";
        inputSearchBtn.click();
        inputSearchBar.click();
        inputSearchBar.sendKeys("sku");
        Assert.assertEquals(sku, inputSearchBar.getText());
        ad.pressKey(new KeyEvent(AndroidKey.ENTER));

        Assert.assertEquals(cartPriceList.getText(), sku);

        return (sku);


    }

    public void SearchBarProductName() throws MalformedURLException {
        productName = "escoba";

        inputSearchBtn.click();
        inputSearchBar.click();
        inputSearchBar.sendKeys(productName);
        Assert.assertEquals(productName, inputSearchBar.getText());
        ad.pressKey(new KeyEvent(AndroidKey.ENTER));

        Assert.assertEquals(cartPriceList.getText(), productName);


        inputSearchBar.sendKeys("escoba");


    }

    public void SearchBarSugested() throws MalformedURLException {
        MobileElement inputSearchBar = ad.findElementByAccessibilityId("Search-bar-btn");
        inputSearchBar.sendKeys("");

    }

}