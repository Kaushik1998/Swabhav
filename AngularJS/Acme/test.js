let getProduct = fetch("./resources/products.jsonx");
let product = getProduct.then((data) => {
  let finalJson = data.json().then((data) => {
    return data;
  });
  return finalJson;
});

