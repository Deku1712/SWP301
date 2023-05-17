const container = document.getElementById('container');
const overlayCon = document.getElementById('overLayCon');
const overlayBtn = document.getElementById('overlayBtn');

overlayBtn.addEventListener('click', () => {
    container.classList.toggle('right-panel-active');

    overlayBtn.classList.remove('btnScaled')
    window.requestAnimationFrame(()=>{
        overlayBtn.classList.add('btnScale');
    })
})