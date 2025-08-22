const items = [
  { id: 1, name: 'Pancakes', price: 5.99, image: 'https://via.placeholder.com/200?text=Pancakes' },
  { id: 2, name: 'Waffles', price: 6.99, image: 'https://via.placeholder.com/200?text=Waffles' },
  { id: 3, name: 'Omelette', price: 7.49, image: 'https://via.placeholder.com/200?text=Omelette' }
];

function getCart() {
  return JSON.parse(localStorage.getItem('cart') || '[]');
}

function saveCart(cart) {
  localStorage.setItem('cart', JSON.stringify(cart));
}

function addToCart(id) {
  const cart = getCart();
  const existing = cart.find(i => i.id === id);
  if (existing) {
    existing.qty++;
  } else {
    cart.push({ id, qty: 1 });
  }
  saveCart(cart);
  updateCartCount();
}

function removeFromCart(id) {
  const cart = getCart().filter(i => i.id !== id);
  saveCart(cart);
  renderCart();
  updateCartCount();
}

function cartCount() {
  return getCart().reduce((sum, i) => sum + i.qty, 0);
}

function updateCartCount() {
  const el = document.getElementById('cart-count');
  if (el) {
    el.textContent = cartCount();
  }
}

function renderItemList() {
  const list = document.getElementById('item-list');
  items.forEach(item => {
    const div = document.createElement('div');
    div.className = 'item';
    div.innerHTML = `\n      <img src="${item.image}" alt="${item.name}">\n      <h3>${item.name}</h3>\n      <p>$${item.price.toFixed(2)}</p>\n      <a href="item.html?id=${item.id}">View</a>\n    `;
    list.appendChild(div);
  });
}

function renderItemDetail() {
  const params = new URLSearchParams(window.location.search);
  const id = parseInt(params.get('id'), 10);
  const item = items.find(i => i.id === id);
  if (!item) return;
  const container = document.getElementById('item-detail');
  container.innerHTML = `\n    <div class="item">\n      <img src="${item.image}" alt="${item.name}">\n      <h2>${item.name}</h2>\n      <p>$${item.price.toFixed(2)}</p>\n      <button onclick="addToCart(${item.id})">Add to cart</button>\n    </div>\n  `;
}

function renderCart() {
  const container = document.getElementById('cart-items');
  const cart = getCart();
  container.innerHTML = '';
  if (cart.length === 0) {
    container.textContent = 'Your cart is empty.';
    return;
  }
  cart.forEach(entry => {
    const item = items.find(i => i.id === entry.id);
    const div = document.createElement('div');
    div.className = 'item';
    div.innerHTML = `\n      <img src="${item.image}" alt="${item.name}">\n      <h3>${item.name}</h3>\n      <p>$${item.price.toFixed(2)} x ${entry.qty}</p>\n      <button onclick="removeFromCart(${item.id})">Remove</button>\n    `;
    container.appendChild(div);
  });
}
