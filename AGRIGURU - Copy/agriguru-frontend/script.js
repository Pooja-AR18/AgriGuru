document.getElementById('predictForm').addEventListener('submit', async function (e) {
  e.preventDefault();

  const form = e.target;
  const data = {
    crop: form.crop.value,
    market: form.market.value,
    state: form.state.value,
    district: form.district.value,
    phone: form.phone.value
  };

  const res = await fetch('http://localhost:8080/api/predict', {
    method: 'POST',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify(data)
  });

  const json = await res.json();

  document.getElementById('result').innerHTML = `
    <p><strong>Predicted Price:</strong> ₹${json.predicted_price}</p>
    <p><strong>Previous Price:</strong> ₹${json.previous_price}</p>
    <p>📩 SMS will be sent if price changed significantly.</p>
  `;
});
