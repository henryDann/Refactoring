
## `ProcesadorPedidos/README.md`

```markdown
# Procesador de Pedidos
Este subproyecto forma parte del repositorio `CODESMELL`. Refactoriza una clase con múltiples code smells para aplicar principios de código limpio y diseño orientado a objetos.

## Funcionalidades
- Cálculo del total del pedido (incluye descuentos y envío express)
- Procesamiento del método de pago (tarjeta o PayPal)
- Envío de confirmación por email al cliente
- Actualización del inventario según las cantidades compradas

## Principios aplicados
- Nombres descriptivos (legible antes que conciso)
- Evitar duplicación (DRY)
- Funciones pequeñas y con única responsabilidad (KISS)

## Estructura del subproyecto
ProcesadorPedidos/
├── App.java
├── DetallesPedido.java
├── Pedido.java
├── ProcesadorPedidos.java
└── README.md
