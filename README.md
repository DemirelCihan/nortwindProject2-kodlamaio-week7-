# norhtwindProject2-kodlamaio-week7-
Kodlama.io week7
Added swagger2 and core package

-----public Docket api() /*uygulama içerisindeki apileri bulup onları test edebileceğimiz bir
	noktaya taşımız olur.l*/{
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("kodlamaio.northwind"))/*Burada yapılan işlem kodlamaio.northwind
				i gez ve içeride bulduğun apileri dökümantasyona yaz komutudur.*/
				.build();-----
        
        process added.
        
        
       --- @PostMapping("/add")/*kullanıcı tarafından bir gönderi gönderilmektedir.*/
    public Result add(@RequestBody Product product){
        return this.productService.add(product);
    }---
    process added.    
    -> /*@PostMapping ile kullanıcı tarafından girilen bir veriyi database e yazmamıza olanak tanır.
    * @RequestBody ile ise Product a bir veri girmemizi sağlar.Gireceğimiz veriyi Product içerisinde'categoryId,id,productName,qantitiyPerUnit... 'gibi
    * alanları gezip uygun olan verileri uygun olan yerlere yazmıs oluyoruz. */
    /*@RequestBody bizim projede yazdığımız 'categoryId,id,productName,qantitiyPerUnit... 'gibi
    alanları Product içerisinde arayıp onları içerisinde map ediyor arka planda */
    
    
    ---DateResult<List<Product>> getAll();//product listesi dönderilmektedir.
   Result add(Product product);---
   ->yapıları oluşturuldu.
   
  @Data
  @AllArgsConstructor//parametreli constructor ları eklemiş oldu
@NoArgsConstructor//parametresiz constructor ları eklemiş oldu.
-> ile Lombak kullanılmış oldu. Lombak ile sürekli yazmamız gereken getter ve setter komutlarını yazmak zorunda kalmadan lombak ile çekmiş olduk.

   
