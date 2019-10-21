package service;

import model.CalculatorData;
public class CalculatorDataCreator {
    public static final String XPATHLOCATOR_SEARCH_FOR_A_PRODUCT = "//div/div/div/div/div";
    public static final String XPATHLOCATOR_NUMBEROFINSTANCE = "//*[@id='input_53']";
    public static final String XPATHLOCATOR_OPERATING_SYSTEM = "//*[@id='select_value_label_46']";
    public static final String TESTDATA_XPATHLOCATOR_VALUE_OPERATING_SYSTEM = "testdata.xpathlocator.valueoperatingsystem";
    public static final String XPATHLOCATOR_MACHINE_CLASS ="//*[@id='select_value_label_47']";
    public static final String TESTDATA_XPATHLOCATOR_VALUE_MACHINE_CLASS ="testdata.xpathlocator.valuemachineclass";
    public static final String XPATHLOCATOR_MACHINE_TYPE ="//*[@id='select_value_label_49']";
    public static final String TESTDATA_XPATHLOCATOR_VALUE_MACHINE_TYPE ="testdata.xpathlocator.valuemachinetype";
    public static final String XPATHLOCATOR_ADD_GPU ="//md-checkbox/div";
    public static final String XPATHLOCATOR__NUMBER_GPU ="//*[@id='select_value_label_346']";
    public static final String TESTDATA_XPATHLOCATOR_VALUE_NUMBER_OF_GPU ="testdata.xpathlocator.valuenumberofGPU";
    public static final String XPATHLOCATOR_GPU_TYPE ="//*[@id='select_value_label_347']/span[1]";
    public static final String TESTDATA_XPATHLOCATOR_VALUE_GPUTYPE="testdata.xpathlocator.value_GPUtype";
    public static final String XPATHLOCATOR_LOCAL_SSD ="//*[@id='select_value_label_50']/span[1]";
    public static final String TESTDATA_XPATHLOCATOR_VALUE_LOCAL_SSD="testdata.xpathlocator.value_local_SSD";
    public static final String XPATHLOCATOR_DATACENTER_LOCATION ="//*[@id='select_value_label_51']/span[1]";
    public static final String TESTDATA_XPATHLOCATOR_VALUE_DATACENTER_LOCATION="testdata.xpathlocator.value_datacenter_location";
    public static final String XPATHLOCATOR_COMMITED_USAGE ="//*[@id='select_value_label_52']/span[1]";
    public static final String TESTDATA_XPATHLOCATOR_VALUE_COMMITED_USAGE="testdata.xpathlocator.value_commited_usage";
    public static final String XPATHLOCATOR_ADD_TO_ESTIMATE ="//div[13]/button";
    public static final String XPATHLOCATOR_EMAIL_ESTIMATE ="//*[@id='email_quote']";
    public static final String XPATHLOCATOR_EMAIL ="//*[@id='input_401']";

    public static CalculatorData withCredentialsFromProperty(){
        return new CalculatorData(XPATHLOCATOR_SEARCH_FOR_A_PRODUCT,
                XPATHLOCATOR_NUMBEROFINSTANCE,
                XPATHLOCATOR_OPERATING_SYSTEM,
                TestDataReader.getTestData(TESTDATA_XPATHLOCATOR_VALUE_OPERATING_SYSTEM),
                XPATHLOCATOR_MACHINE_CLASS,
                TestDataReader.getTestData(TESTDATA_XPATHLOCATOR_VALUE_MACHINE_CLASS),
                XPATHLOCATOR_MACHINE_TYPE,
                TestDataReader.getTestData(TESTDATA_XPATHLOCATOR_VALUE_MACHINE_TYPE),
                XPATHLOCATOR_ADD_GPU,
                XPATHLOCATOR__NUMBER_GPU,
                TestDataReader.getTestData(TESTDATA_XPATHLOCATOR_VALUE_NUMBER_OF_GPU),
                XPATHLOCATOR_GPU_TYPE,
                TestDataReader.getTestData(TESTDATA_XPATHLOCATOR_VALUE_GPUTYPE),
                XPATHLOCATOR_LOCAL_SSD,
                TestDataReader.getTestData(TESTDATA_XPATHLOCATOR_VALUE_LOCAL_SSD),
                XPATHLOCATOR_DATACENTER_LOCATION,
                TestDataReader.getTestData(TESTDATA_XPATHLOCATOR_VALUE_DATACENTER_LOCATION),
                XPATHLOCATOR_COMMITED_USAGE,
                TestDataReader.getTestData(TESTDATA_XPATHLOCATOR_VALUE_COMMITED_USAGE),
                XPATHLOCATOR_ADD_TO_ESTIMATE,
                XPATHLOCATOR_EMAIL_ESTIMATE,
                XPATHLOCATOR_EMAIL);
    }







}
