describe('api-resize-observer', () => {


  let page
  beforeAll(async () => {
    page = await program.reLaunch('/pages/API/resize-observer/resize-observer')
    await page.waitFor('button')
  })

  it('check_resize-observer', async () => {
    await page.waitFor(600)
    const image = await program.screenshot({fullPage: true});
    expect(image).toSaveImageSnapshot();
  })

  it('check_outbox_resize', async () => {
    await page.callMethod('setOutBoxMarginLeft', '100px')
    await page.waitFor(500)
    const value = await page.data('outBoxElementOnResize')
    expect(value).toBe(false)
  })
})