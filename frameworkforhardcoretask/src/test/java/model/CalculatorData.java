package model;

public class CalculatorData {

    private String SearchForAProduct;
    private String NumberOfInstances;
    private String OperatingSystemLocator;
    private String ValueOfOperatingSystem;
    private String MachineClass;
    private String ValueOfMachineClass;
    private String MachineType;
    private String ValueOfMachineType;
    private String AddGPU;
    private String NumberOfGPUs;
    private String ValueOfNumberOfGPUs;
    private String GPUType;
    private String ValueOfGPUType;
    private String LocalSSD;
    private String ValueOfLocalSSD;
    private String DatacenterLocation;
    private String ValueOfDatacenterLocation;
    private String CommitedUsage;
    private String ValueOfCommitedUsage;
    private String AddToEstimate;
    private String EmailEstimate;
    private String Email;

    public CalculatorData(String searchForAProduct, String numberOfInstances,
                          String operatingSystemLocator, String valueOfOperatingSystem,
                          String machineClass, String valueOfMachineClass, String machineType,
                          String valueOfMachineType, String addGPU, String numberOfGPUs,
                          String valueOfNumberOfGPUs, String GPUType, String valueOfGPUType,
                          String localSSD, String valueOfLocalSSD, String datacenterLocation,
                          String valueOfDatacenterLocation, String commitedUsage,
                          String valueOfCommitedUsage, String addToEstimate, String emailEstimate,String email) {
        SearchForAProduct = searchForAProduct;
        NumberOfInstances = numberOfInstances;
        OperatingSystemLocator = operatingSystemLocator;
        ValueOfOperatingSystem = valueOfOperatingSystem;
        MachineClass = machineClass;
        ValueOfMachineClass = valueOfMachineClass;
        MachineType = machineType;
        ValueOfMachineType = valueOfMachineType;
        AddGPU = addGPU;
        NumberOfGPUs = numberOfGPUs;
        ValueOfNumberOfGPUs = valueOfNumberOfGPUs;
        this.GPUType = GPUType;
        ValueOfGPUType = valueOfGPUType;
        LocalSSD = localSSD;
        ValueOfLocalSSD = valueOfLocalSSD;
        DatacenterLocation = datacenterLocation;
        ValueOfDatacenterLocation = valueOfDatacenterLocation;
        CommitedUsage = commitedUsage;
        ValueOfCommitedUsage = valueOfCommitedUsage;
        AddToEstimate = addToEstimate;
        EmailEstimate = emailEstimate;
        Email=email;

    }

    public String getEmail() {
        return Email;
    }

    public String getSearchForAProduct() {
        return SearchForAProduct;
    }

    public String getOperatingSystemLocator() {
        return OperatingSystemLocator;
    }

    public String getNumberOfInstances() {
        return NumberOfInstances;
    }

    public String getValueOfOperatingSystem() {
        return ValueOfOperatingSystem;
    }

    public String getValueOfMachineClass() {
        return ValueOfMachineClass;
    }

    public String getValueOfMachineType() {
        return ValueOfMachineType;
    }

    public String getValueOfNumberOfGPUs() {
        return ValueOfNumberOfGPUs;
    }

    public String getValueOfGPUType() {
        return ValueOfGPUType;
    }

    public String getValueOfLocalSSD() {
        return ValueOfLocalSSD;
    }

    public String getValueOfDatacenterLocation() {
        return ValueOfDatacenterLocation;
    }

    public String getValueOfCommitedUsage() {
        return ValueOfCommitedUsage;
    }

    public String getMachineClass() {
        return MachineClass;
    }

    public String getMachineType() {
        return MachineType;
    }

    public String getAddGPU() {
        return AddGPU;
    }

    public String getNumberOfGPUs() {
        return NumberOfGPUs;
    }

    public String getGPUType() {
        return GPUType;
    }

    public String getLocalSSD() {
        return LocalSSD;
    }

    public String getDatacenterLocation() {
        return DatacenterLocation;
    }

    public String getCommitedUsage() {
        return CommitedUsage;
    }

    public String getAddToEstimate() {
        return AddToEstimate;
    }

    public String getEmailEstimate() {
        return EmailEstimate;
    }
}
