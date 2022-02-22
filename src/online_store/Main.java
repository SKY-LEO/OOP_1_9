package online_store;

public class Main {
    public static void main(String[] args) {
        Product intel = new Product("Intel i3-8100", 125, 4.1);
        Product amd = new Product("Amd r7-4800", 340, 4.7);
        Product gpu_rtx = new Product("Nvidia rtx 3080", 1500, 4.8);
        Product gpu_gtx = new Product("Nvidia gt 1030", 50, 3.2);
        Product ssd_samsung = new Product("Samsung evo 970", 100, 4.9);
        Product ssd_kingston = new Product("Kingston A400", 50, 3.9);
        Product[] cpus = {intel, amd};
        Product[] gpus = {gpu_rtx, gpu_gtx};
        Product[] ssd = {ssd_samsung, ssd_kingston};
        Category hardware_cpu = new Category("Processors", cpus);
        Category hardware_gpu = new Category("Video cards", gpus);
        Category hardware_ssd = new Category("SSDs", ssd);
        User user = new User("login", "password", new Basket(3));
        user.basket.addProduct(ssd_kingston);
    }
}
