class Computer {
    private String brand;
    private String model;

    public Computer(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    class Processor {
        private String manufacturer;
        private String model;

        public Processor(String manufacturer, String model) {
            this.manufacturer = manufacturer;
            this.model = model;
        }

        public void display() {
            System.out.println("Manufacturer: " + manufacturer);
            System.out.println("Model: " + model);
        }
    }

    public void show() {
        Processor p = new Processor("Intel", "i7");
        p.display();
    }

    public static void main(String[] args) {
        Computer c = new Computer("Dell", "XPS 13");
        c.show();

        Runnable r = new Runnable() {
            public void run() {
                System.out.println("Anonymous class");
            }
        };
        r.run();
    }
}
